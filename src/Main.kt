data class QuizQuestion(val question: String, val answer: String)

fun runQuiz(questions: List<QuizQuestion>) {
    var score = 0
    for ((index, question) in questions.withIndex()) {
        println("Question ${index + 1}:")
        println(question.question)

        print("Your answer: ")
        val userAnswer = readLine()

        if (userAnswer.equals(question.answer, ignoreCase = true)) {
            println("Correct!")
            score++
        } else {
            println("Incorrect. The correct answer is: ${question.answer}")
        }

        println()
    }

    println("Quiz completed. Your score: $score/${questions.size}")
}

fun main() {
    val questions = listOf(
        QuizQuestion("What does NFL stand for?", "National Football League"),
        QuizQuestion("Who is the greatest NBA player ever?", "Michael Jordan"),
        QuizQuestion("What is sony's new console called?", "Playstation 5"),
        QuizQuestion("What is the McHenry County College Acronym?", "MCC"),
        QuizQuestion("What is the state we live in?", "Illinois")
    )

    runQuiz(questions)
}