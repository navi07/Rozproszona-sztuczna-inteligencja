public enum AcademicTitle {

    Doctor {
        @Override
        public String toString(){
            return "Doctor";
        }
    },
    Assistant{
        @Override
        public String toString(){
            return "Assistant";
        }
    },
    AssociateProfessor{
        @Override
        public String toString(){
            return "Associate Professor";
        }
    },
    FullProfessor{
        @Override
        public String toString(){
            return "Full Professor";
        }
    },
    Lecturer{
        @Override
        public String toString(){
            return "Lecturer";
        }
    },
    PhDStudent{
        @Override
        public String toString(){
            return "PhD Student";
        }
    },
    Student{
        @Override
        public String toString(){
            return "Student";
        }
    }
}
