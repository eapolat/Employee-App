public class Project {

    final double TAX = 0.13;
    final int OVERHEAD = 50000;
    final int EMP_HOURS_WEEK = 45;

    public static int projectCounter = 5000;

    private String projectId;
    private String projectName;
    private char projectType;
    private double personHours;
    private int projectWeeks;
    private double ratePerHour;


public Project (String Name, int pHours, double rate, int Weeks) {
    
    projectName = Name;
    personHours = pHours;
    ratePerHour = rate;
    projectWeeks = Weeks;

    projectCounter++;
    setProjectID();
    setProjectType();

}

public String accesor_projectID() {

    return projectId;

}
public String accesor_projectName() {

    return projectName;

}
public double accesor_personHours() {

    return personHours;

}
public double accesor_ratePerHour() {

    return ratePerHour;

}
public int accesor_projectWeeks() {

    return projectWeeks;

}
public char accesor_projectType() {

    return projectType;

}

public void setProjectName(String name) {

    projectName = name;

}

public void setPersonHours (double hours) {

    if (hours > 0 ) {
        personHours = hours;
    }
    else {
        personHours = 0;
    }
}

public void setRatePerHour (double rate) {

    if (rate > 0 ) {
        ratePerHour = rate;
    }
    else {
        ratePerHour = 0;
    }
}

public void setProjectWeeks (int weeks) {

    if (weeks > 0 ) {
        projectWeeks = weeks;
    }
    else {
        projectWeeks = 0;
    }

}

private void setProjectID () {

    projectId = "2023-" + projectCounter; 

}

private void setProjectType () {

    double projectCost = calculateProjectCost();

    if (projectCost > 1000000) {

        projectType = 'm';

    }
    else if (projectCost > 500000 && projectCost < 1000000 ) {

        projectType = 'l';
    
    }
    else if (projectCost > 0 && projectCost < 500000){
        
        projectType = 's';
    }
    else{
        projectType = 'i';
    }

}

public void deactivateProject() {

    projectType = 'i';
    personHours = 0;
    ratePerHour = 0;

}

public void activateProject(double hours, double rate) {

    personHours = hours;
    ratePerHour = rate;
    setProjectType();
}

public double calculateProjectCost() {

    double human_resource_cost = (personHours * ratePerHour);

    if (human_resource_cost < 20000) {

        return human_resource_cost;

    }
    else {

        double cost = human_resource_cost + (OVERHEAD * TAX);

        return cost;
    }


}

public int calculatePersonresources () {

    double person_resources = (projectWeeks * EMP_HOURS_WEEK) / personHours;
    int person_resources_2 = (int) Math.round(person_resources);
    return person_resources_2;

}

public String toString() {

    if (projectType != 'i') {
    
        return String.format("Project Name: " + projectName + "%nProject ID: " + projectId + "%nProject Type: " + projectType + "%nTeam Size: " + calculatePersonresources() + "%nEstimated Project Cost: " + calculateProjectCost());
    }
    else {

        return String.format("-------INACTIVE PROJECT------ %nProject Name: " + projectName + "%nProject ID: " + projectId);
    }

}

}