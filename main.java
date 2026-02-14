import java.util.Scanner;

class Materia {
    private String name;
    private String key;
    private int credits;
    private int weeklyhours;

    public Materia() {
        this.name = "";
        this.key = "";
        this.credits = 0;
        this.weeklyhours = 0;
    }

    public Materia(String name, String key, int credits, int weeklyhours) {
        this.name = name;
        this.key = key;
        this.credits = credits;
        this.weeklyhours = weeklyhours;
    }

    public Materia(Materia m) {
        this.name = m.name;
        this.key = m.key;
        this.credits = m.credits;
        this.weeklyhours = m.weeklyhours;
    }

    public String getname() { return name; }
    public String getkey() { return key; }
    public int getcredits() { return credits; }
    public int getweeklyhours() { return weeklyhours; }
}

class curso {
    private String name;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public curso() {
        this.name = "";
    }

    public curso(String name, Materia m1, Materia m2, Materia m3){
        this.name = name;
        this.materia1 = new Materia(m1);
        this.materia2 = new Materia(m2);
        this.materia3 = new Materia(m3);
    }

    public curso(curso c) {
        this.name = c.name;
        this.materia1 = new Materia(c.materia1);
        this.materia2 = new Materia(c.materia2);
        this.materia3 = new Materia(c.materia3);
    }

    public String getname() { return name; }
    public Materia getMateria1() { return materia1; }
    public Materia getMateria2() { return materia2; }
    public Materia getMateria3() { return materia3; }
}

class professor {
    private String name;
    private String nominatednumber;
    private double hourlywage;
    private Materia materia;

    public professor() {
        this.name = "";
        this.nominatednumber = "";
        this.hourlywage = 0;
    }

    public professor(String name, String nominatednumber, double hourlywage) {
        this.name = name;
        this.nominatednumber = nominatednumber;
        this.hourlywage = hourlywage;
    }

    public void asignarmateria(Materia materia) {
        this.materia = materia;
    }

    public String getName() { return name; }
    public String getNominatednumber() { return nominatednumber; }
    public Materia getMateria() { return materia; }
}

class student {
    private String ID;
    private String name;
    private int age;
    private curso curso;

    public student() {
        this.ID = "";
        this.name = "";
        this.age = 0;
    }

    public student(String ID, String name, int age, curso curso) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.curso = curso;
    }

    public String getID() { return ID; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public curso getCurso() { return curso; }
}

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear materias
        Materia m1 = new Materia("Matematicas", "MAT101", 5, 4);
        Materia m2 = new Materia("Programacion", "PRO101", 6, 5);
        Materia m3 = new Materia("Fisica", "FIS101", 4, 3);

        // Crear curso
        curso curso1 = new curso("Ingenieria en Software", m1, m2, m3);

        // Crear profesores
        professor p1 = new professor("Carlos Ramirez", "P001", 150);
        professor p2 = new professor("Ana Torres", "P002", 180);
        professor p3 = new professor("Luis Mendoza", "P003", 160);

        p1.asignarmateria(m1);
        p2.asignarmateria(m2);
        p3.asignarmateria(m3);

        // Crear alumnos
        student s1 = new student("A001", "Pedro Lopez", 18, curso1);
        student s2 = new student("A002", "Maria Garcia", 19, curso1);
        student s3 = new student("A003", "Juan Perez", 18, curso1);

        int opcion;

        do {
            System.out.println("\n----- ESCUELA -----");
            System.out.println("1) Ver Materias");
            System.out.println("2) Ver Alumnos");
            System.out.println("3) Ver Profesores");
            System.out.println("4) Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch(opcion) {

                case 1:
                    int opMateria;
                    do {
                        System.out.println("\n--- MATERIAS ---");
                        System.out.println("1) Matematicas");
                        System.out.println("2) Programacion");
                        System.out.println("3) Fisica");
                        System.out.println("4) Regresar");
                        System.out.print("Elige una materia: ");
                        opMateria = sc.nextInt();

                        if(opMateria == 1) {
                            mostrarMateria(m1, curso1, p1, s1, s2, s3);
                        }
                        else if(opMateria == 2) {
                            mostrarMateria(m2, curso1, p2, s1, s2, s3);
                        }
                        else if(opMateria == 3) {
                            mostrarMateria(m3, curso1, p3, s1, s2, s3);
                        }

                    } while(opMateria != 4);
                    break;

                case 2:
                    System.out.println("\n--- ALUMNOS ---");
                    mostrarAlumno(s1);
                    mostrarAlumno(s2);
                    mostrarAlumno(s3);
                    break;

                case 3:
                    System.out.println("\n--- PROFESORES ---");
                    mostrarProfesor(p1);
                    mostrarProfesor(p2);
                    mostrarProfesor(p3);
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema escolar. Hasta luego");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while(opcion != 4);

        sc.close();
    }

    public static void mostrarMateria(Materia m, curso c, professor p, student s1, student s2, student s3) {
        System.out.println("\nMateria: " + m.getname());
        System.out.println("Clave: " + m.getkey());
        System.out.println("Curso: " + c.getname());
        System.out.println("Profesor: " + p.getName());
        System.out.println("\nAlumnos inscritos:");
        System.out.println(s1.getName() + " - " + s1.getID());
        System.out.println(s2.getName() + " - " + s2.getID());
        System.out.println(s3.getName() + " - " + s3.getID());
    }

    public static void mostrarAlumno(student s) {
        System.out.println("Nombre: " + s.getName());
        System.out.println("Matricula: " + s.getID());
        System.out.println("Edad: " + s.getAge());
        System.out.println("------------------");
    }

    public static void mostrarProfesor(professor p) {
        System.out.println("Nombre: " + p.getName());
        System.out.println("Nomina: " + p.getNominatednumber());
        System.out.println("Materia: " + p.getMateria().getname());
        System.out.println("------------------");
    }
}