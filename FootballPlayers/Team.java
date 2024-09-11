package FootballPlayers;

public class Team {
    private int id;
    private String name;
    private String managerFullName;
    private String group;

    public Team(int id, String name, String managerFullName, String group) {
        this.id = id;
        this.name = name;
        this.managerFullName = managerFullName;
        this.group = group;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManagerFullName() {
        return managerFullName;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManagerFullName(String managerFullName) {
        this.managerFullName = managerFullName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerFullName='" + managerFullName + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
