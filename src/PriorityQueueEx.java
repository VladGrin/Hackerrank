import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

class StudentP implements Comparable<StudentP> {
    int id;
    String name;
    double cgpa;

    public StudentP(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "StudentP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(StudentP o) {
        if (this.cgpa != o.getCgpa()) {
            if(o.getCgpa() > this.cgpa){
                return 1;
            } else {
                return -1;
            }
        } else if (this.name.compareTo(o.getName()) != 0) {
            return this.name.compareTo(o.getName());
        } else {
            return this.id - o.getId();
        }
    }
}

class Priorities {
    List<StudentP> getStudents(List<String> events) {
        if (events == null) {
            return null;
        }
        PriorityQueue<StudentP> pQueue = new PriorityQueue<>();
        for (String list : events) {
            if (list.equals("SERVED")) {
                if(pQueue.isEmpty()){
                    continue;
                } else {
                    pQueue.poll();
                }
            } else {
                int id = Integer.parseInt(list.split(" ")[3]);
                String name = list.split(" ")[1];
                double cgpa = Double.parseDouble(list.split(" ")[2]);
                pQueue.offer(new StudentP(id, name, cgpa));
            }
        }
        return pQueue.stream().sorted().collect(Collectors.toList());
    }
}

public class PriorityQueueEx {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<StudentP> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (StudentP st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
//    PriorityQueue<Student> pq = new PriorityQueue<(
//            Comparator.comparing(Student::getCgpa).reversed()
//                    .thenComparing(Student::getFname)
//                    .thenComparing(Student::getToken)
//    );