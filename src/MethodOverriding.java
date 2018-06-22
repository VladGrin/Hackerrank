public class MethodOverriding {
    public static void main(String[] args) {
        Soccer soccer = new Soccer();

        soccer.getNumberOfTeamMembers();

    }
}
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        super.getNumberOfTeamMembers();
    }
}