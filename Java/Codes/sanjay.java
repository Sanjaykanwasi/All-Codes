class sports {
    public String getname() {
        return "Generic Sports";
    }

    public void getNumberofTeamMembers() {
        System.out.println("Each team has n players in " + getname());
    }
}

class Soccer extends sports {
    @Override
    public String getname() {
        return "Soccer Class";
    }

    @Override
    public void getNumberofTeamMembers() {
        System.out.println("Each team has 11 players in " + getname());
    }
}

public class sanjay {
    public static void main(String[] args) {
        sports obj = new sports();
        System.out.println(obj.getname());
        obj.getNumberofTeamMembers();

        Soccer obj2 = new Soccer();
        System.out.println(obj2.getname());
        obj2.getNumberofTeamMembers();

    }
}