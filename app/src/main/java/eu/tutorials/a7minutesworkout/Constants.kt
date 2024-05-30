package eu.tutorials.a7minutesworkout

/**
 * Constant Class where you can add the constant values of the project.
 */
// TODO(Step  5- Making a default list of exercises in the Constant file along with the name image using the Model Class which later on will be used to show in the UI.)
// START
class Constants {
    companion object {

        // The drawable images used here are added in the drawable folder.
        /**
         * Here we are adding all exercises to a single list with all the default values.
         */
        fun defaultExerciseList(): ArrayList<ExerciseModel> {

            val exerciseList = ArrayList<ExerciseModel>()

            val jumpingJacks =
                ExerciseModel(1, "Jumping Jacks", R.drawable.ic_jumping_jacks, false, false)
            exerciseList.add(jumpingJacks)
            val plank = ExerciseModel(2, "Plank", R.drawable.ic_plank, false, false)
            exerciseList.add(plank)
            return exerciseList
        }
    }
}