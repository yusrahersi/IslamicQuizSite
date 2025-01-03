package com.example.Islamicquizapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class QuizController {

    static class Question {
        private String question;
        private List<String> options;
        private String correctAnswer;

        public Question(String question, List<String> options, String correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public List<String> getOptions() {
            return options;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }
    }

    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return List.of(
            new Question("What is the first pillar of Islam?", 
                List.of("Shahada", "Salah", "Zakat", "Hajj"), "Shahada"),
            new Question("How many surahs are there in the Quran?", 
                List.of("114", "100", "99", "120"), "114"),
            new Question("Which angel brought revelation to Prophet Muhammad (PBUH)?", 
                List.of("Angel Jibril", "Angel Mikail", "Angel Israfil", "Angel Malik"), "Angel Jibril"),
            new Question("What is the first word revealed to Prophet Muhammed (PBUH)?", 
                List.of("Salam", "Iqra", "Alaq", "Salah"), "Iqra"),
            new Question("Which name of Allah means 'The Subtle'?", 
                List.of("Al-Lateef", "Ar-Rahman", "Al-Wadood", "Al-Kareem"), "Al-Lateef"),
            new Question("What is the holy book of Islam?", 
                List.of("Bible", "Torah", "Quran", "Vedas"), "Quran"),
            new Question("Which prophet built the Kaaba with his son?", 
                List.of("Prophet Ibrahim", "Prophet Musa", "Prophet Isa", "Prophet Nuh"), "Prophet Ibrahim"),
            new Question("In which city was the Prophet Muhammad (PBUH) born?", 
                List.of("Medina", "Mecca", "Jerusalem", "Baghdad"), "Mecca"),
            new Question("What is the Arabic term for charity?", 
                List.of("Salah", "Zakat", "Hajj", "Sawm"), "Zakat"),
            new Question("What is the name of the night journey of the Prophet (PBUH)?", 
                List.of("Isra and Miraj", "Hijra", "Ghazwa", "Jihad"), "Isra and Miraj"),
            new Question("Which month do Muslims fast during?", 
                List.of("Rajab", "Shawwal", "Ramadan", "Muharram"), "Ramadan"),
            new Question("What is the term for the Islamic prayer performed five times daily?", 
                List.of("Dua", "Salah", "Zakat", "Hajj"), "Salah"),
            new Question("How many rakats are in Fajr prayer?", 
                List.of("4", "3", "2", "5"), "2"),
            new Question("Who was the first caliph of Islam?", 
                List.of("Umar ibn al-Khattab", "Abu Bakr", "Ali ibn Abi Talib", "Uthman ibn Affan"), "Abu Bakr"),
            new Question("Which battle was the first major battle fought by the Prophet (PBUH)?", 
                List.of("Battle of Badr", "Battle of Uhud", "Battle of Khandaq", "Battle of Hunayn"), "Battle of Badr"),
            new Question("What is the Islamic term for permissible actions?", 
                List.of("Haram", "Makruh", "Halal", "Mustahabb"), "Halal"),
            new Question("Who was the last prophet in Islam?", 
                List.of("Prophet Isa", "Prophet Ibrahim", "Prophet Musa", "Prophet Muhammad"), "Prophet Muhammad"),
            new Question("How many times is the word 'Allah' mentioned in the Quran?", 
                List.of("2698", "3000", "5000", "1000"), "2698"),
            new Question("What is the direction Muslims face during Salah?", 
                List.of("Kaaba", "North", "Medina", "Jerusalem"), "Kaaba"),
            new Question("What is the meaning of 'Islam'?", 
                List.of("Peace and Submission", "War", "Patience", "Obedience"), "Peace and Submission")
        );
    }
}    