package Containers;

public enum Course {

    iTEducation{
        @Override
        public String toString(){
            return "IT Education";
        }
    },
    AppliedComputerScience{
        @Override
        public String toString(){
            return "Applied Computer Science";
        }
    },
    HeatEngineering{
        @Override
        public String toString(){
            return "Heat Engineering";
        }
    },
    MaterialEngineering{
        @Override
        public String toString(){
            return "Material Engineering";
        }
    },
    ComputationalEngineering{
        @Override
        public String toString(){
            return "Computational Engineering";
        }
    },
    Metallurgy{
        @Override
        public String toString(){
            return "Metallurgy";
        }
    }
}
