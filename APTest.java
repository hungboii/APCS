public void updateCosts(double piano, double voice, double reg)
{
    for(Lesson les : lessonList)
    {
        if(les.getType().equals("piano"))
            les.setCost(les.getCost() + piano);
        else if(les.getType().equals("voice"))
            les.setCost(les.getCost() + voice);
        else
            les.setCost(les.getCost() + reg);
    }
}

public double getDiscountedLessonCost(double discount)
{
    ArrayList<Lesson> lessons = new ArrayList<Lesson>;
    for(Lesson les : lessonList)
    {
        if(les.getType().equals("piano" && les.isRegEarly()))
            lessons.add(les);
    }
    int selection = (int)(Math.random() * (lessons.size()));
    lessons.get(selection).setCost(lesson.getCost() - discount);
    return lessons.get(selection).getCost();
}


public static double analyzeInts(int max, int n)
{
    int[] values = new int[n];
    int counter = 0;
    for(int i = 0; i < values.length; i++)
    {
        values[i] = getInt();
    }
    for(int value : values)
    {
        if(value > 0 && value < max && value % 3 == 0)
            counter++;
    }
    double prop = (double)counter / n;
    return prop;
    
}