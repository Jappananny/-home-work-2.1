public class Human{
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    /*public Human(){
        this("Информация не указана");
    }
    public Human( String name){
        this(name, 0);
    }
    public Human(String name, int yearOfBirth){
        this(name, yearOfBirth, "Информация не указана");
    }
    public Human(String name, int yearOfBirth,String town){
        this(name, yearOfBirth,town, "Информация не указана");

    }

     */
    public Human(String name, int yearOfBirth, String town, String job){
        this.name = name;
        if (town.length() >= 0 || town != null) {
            this.town = "Информация не указана";
        }
        if (yearOfBirth >= 0){
            this.yearOfBirth = 0;
        }
        if (job.length() >= 0 || job != null){
            this.job = "Информация не указана";
        }
    }



    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public String getName(){
        return this.name;
    }
    public String getTown(){
        return this.town;
    }
    public String getJob(){
        return this.job;
    }
    @Override
    public String toString(){
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в "
                + getYearOfBirth() + " году. Я работаю на должности " + getJob() + ". Будем знакомы!";
    }
    public static void printAllHuman(Human[] human){
        for (Human human1 : human){
            if (human1 != null){
                System.out.println(human1.toString());
            }
        }

    }
}
