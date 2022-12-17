public Pet(String initialName, int initialAge,
           double initialWeight)
{
    set(initialName, initialAge, initialWeight);
}
public void setPet(String newName, int newAge,
        double newWeight)
{
    set(newName, newAge, newWeight);
}
private void set(String newName, int newAge, double newWeight)
{
    name = newName;
    if ((newAge < 0) || (newWeight < 0))
    {
        System.out.println("Error: Negative age or weight.");
        System.exit(0);
    }
    else
    {
        age = newAge;
        weight = newWeight;
    }
} 