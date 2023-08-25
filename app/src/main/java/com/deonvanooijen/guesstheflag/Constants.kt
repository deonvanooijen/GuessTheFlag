package com.deonvanooijen.guesstheflag

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        //1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "United Kingdom", "New Zealand",
            "Australia", "Canada",
            3
        )
        questionsList.add(que2)

        //3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany", "The Netherlands",
            "Austria", "Belgium",
            4
        )
        questionsList.add(que3)

        //4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Jamaica", "Philippines",
            "Brazil", "Peru",
            3
        )
        questionsList.add(que4)

        //5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Sweden", "Denmark",
            "Finland", "Iceland",
            2
        )
        questionsList.add(que5)

        //6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Australia",
            "United Kingdom", "Indonesia",
            1
        )
        questionsList.add(que6)

        //7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Italy", "Spain",
            "Belgium", "Germany",
            4
        )
        questionsList.add(que7)

        //8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "United Kingdom", "New Zealand",
            "Australia", "Sweden",
            2
        )
        questionsList.add(que8)

        //9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Italy",
            "Ivory Coast", "Mexico",
            1
        )
        questionsList.add(que9)

        //10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Afghanistan", "Hungary",
            "Kuwait", "Nigeria",
            3
        )
        questionsList.add(que10)

        return questionsList
    }

}