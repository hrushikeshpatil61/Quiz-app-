package com.example.quizapp

object setData {
   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()
       var question1=QuestionData(
           question = "what is capital of India",
           id = 1,
           option_one = "up",
           option_two = "MP",
           option_three = "Lucknow",
           option_four = "Delhi",
           correct_ans = 3
       )
       var question2=QuestionData(
           question = "what is capital of India",
           id = 2,
           option_one = "up",
           option_two = "MP",
           option_three = "Lucknow",
           option_four = "Delhi",
           correct_ans = 3
       )
       var question3=QuestionData(
           question = "what is capital of India",
           id = 3,
           option_one = "up",
           option_two = "MP",
           option_three = "Lucknow",
           option_four = "Delhi",
           correct_ans = 3
       )
       var question4=QuestionData(
           question = "what is capital of India",
           id = 4,
           option_one = "up",
           option_two = "MP",
           option_three = "Lucknow",
           option_four = "Delhi",
           correct_ans = 3
       )
       var question5=QuestionData(
           question = "what is capital of India",
           id = 5,
           option_one = "up",
           option_two = "MP",
           option_three = "Lucknow",
           option_four = "Delhi",
           correct_ans = 3
       )
       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)

       return que

   }
}