const quizContainer = document.getElementById('quiz-container');
const nextButton = document.getElementById('next-button');
const scoreDisplay = document.getElementById('score');

let currentQuestionIndex = 0;
let score = 0;
let questions = [];

async function fetchQuestions() { //fetch from backend
    const response = await fetch('/questions');
    questions = await response.json();
    displayQuestion();
}

// Display the current question
function displayQuestion() {
    const question = questions[currentQuestionIndex];
    quizContainer.innerHTML = `
        <div class="question">${question.question}</div>
        ${question.options
            .map(
                (option) =>
                    `<button class="option" onclick="checkAnswer('${option}')">${option}</button>`
            )
            .join('')}
    `;
}

function checkAnswer(selectedOption) {
    const question = questions[currentQuestionIndex];
    if (selectedOption === question.correctAnswer) {
        score++;
        scoreDisplay.textContent = `Score: ${score}`;
    }

    nextButton.disabled = false;
}

nextButton.addEventListener('click', () => {
    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
        displayQuestion();
        nextButton.disabled = true;
    } else {
        quizContainer.innerHTML = `<h2>Quiz Completed!</h2><p>Your final score is ${score}/${questions.length}.</p>`;
        nextButton.style.display = 'none';
    }
});

fetchQuestions(); //starting point
