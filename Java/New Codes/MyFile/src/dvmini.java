import java.util.Scanner;

// Class to represent a quiz question
class Question {
    private String prompt;
    private String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }

    public String getPrompt() {
        return prompt;
    }

    public String getAnswer() {
        return answer;
    }
}

// Class to represent a quiz
class Quiz {
    private Question[] questions;
    private int score;
    private Scanner scanner;

    public Quiz() {
        scanner = new Scanner(System.in);
        score = 0;
        initializeQuestions();
    }

    private void initializeQuestions() {
        questions = new Question[5];
        questions[0] = new Question(
                "1. Which visualization is used to compare the relationship between three variables simultaneously?\n" +
                        "a) Scatter Plot\nb) Bubble Chart\nc) Line Chart\nd) Histogram",
                "b");
        questions[1] = new Question("2. What does a parallel coordinates plot visualize?\n" +
                "a) Relationship between categorical variables\nb) Distribution of a single variable\nc) Relationship between multiple variables\nd) Time-series data",
                "c");
        questions[2] = new Question(
                "3. Which visualization is suitable for detecting outliers and assessing the spread of data?\n" +
                        "a) Bar Chart\nb) Violin Plot\nc) Box Plot\nd) Pie Chart",
                "c");
        questions[3] = new Question("4. What does color mapping represent in multivariate data visualization?\n" +
                "a) Categorical variables\nb) Time-series data\nc) Trends in data\nd) Distribution of a single variable",
                "a");
        questions[4] = new Question(
                "5. Which type of plot is used to visualize the relationship between multiple pairs of variables?\n" +
                        "a) Bar Chart\nb) Heatmap\nc) Scatter Plot Matrix\nd) Line Chart",
                "c");
    }

    public void runQuiz() {
        for (Question question : questions) {
            System.out.println(question.getPrompt());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();
            if (userAnswer.equals(question.getAnswer())) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + question.getAnswer() + "\n");
            }
        }
        System.out.println("Quiz completed! Your score is: " + score + "/5");
    }
}

public class dvmini {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.runQuiz();
    }
}
