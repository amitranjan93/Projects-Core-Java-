//HOSPITAL MANAGEMENT SYSTEM by Amit Ranjan

import java.util.*;

class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String phoneNumber;
    private String address;

    public Patient(int id, String name, int age, String gender, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

class Doctor {
    private int id;
    private String name;
    private String specialization;
    private String phoneNumber;

    public Doctor(int id, String name, String specialization, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private String dateTime;

    public Appointment(int id, int patientId, int doctorId, String dateTime) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String toString() {
        return "Appointment ID: " + id + ", Patient ID: " + patientId + ", Doctor ID: " + doctorId + ", Date and Time: "
                + dateTime;
    }

}

public class HMS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

        while (true) {
            System.out.println("Hospital Management System Menu");
            System.out.println("1. Add a new patient");
            System.out.println("2. Add a new doctor");
            System.out.println("3. Schedule an appointment");
            System.out.println("4. View all appointments for a given doctor");
            System.out.println("5. View all appointments for a given patient");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter patient ID:");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter patient name:");
                    String patientName = scanner.nextLine();
                    System.out.println("Enter patient age:");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter patient gender:");
                    String patientGender = scanner.nextLine();
                    System.out.println("Enter patient phone number:");
                    String patientPhoneNumber = scanner.nextLine();
                    System.out.println("Enter patient address:");
                    String patientAddress = scanner.nextLine();

                    Patient newPatient = new Patient(patientId, patientName, patientAge, patientGender,
                            patientPhoneNumber, patientAddress);
                    patients.add(newPatient);
                    System.out.println("-----PATIENT SUCCESSFULLY ADDED-----");
                    break;

                case 2:
                    System.out.println("Enter doctor ID:");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter doctor name:");
                    String doctorName = scanner.nextLine();
                    System.out.println("Enter doctor specialization:");
                    String doctorSpecialization = scanner.nextLine();
                    System.out.println("Enter doctor phone number:");
                    String doctorPhoneNumber = scanner.nextLine();

                    Doctor doctor1 = new Doctor(1, "Dr. Smith", "Cardiology", "555-555-1111");
                    doctors.add(doctor1);
                    Doctor doctor2 = new Doctor(2, "Dr. Johnson", "Oncology", "555-555-2222");
                    doctors.add(doctor2);
                    Doctor newDoctor = new Doctor(doctorId, doctorName, doctorSpecialization, doctorPhoneNumber);
                    doctors.add(newDoctor);

                    System.out.println("-----DOCTOR ADDED SUCCESSFULLY-----");
                    break;

                case 3:
                    System.out.println("Enter appointment ID:");
                    int appointmentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter patient ID:");
                    int patientIdForAppointment = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter doctor ID:");
                    int doctorIdForAppointment = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter appointment date and time (YYYY-MM-DD HH:MM):");
                    String appointmentDateTime = scanner.nextLine();

                    Appointment newAppointment = new Appointment(appointmentId, patientIdForAppointment,
                            doctorIdForAppointment, appointmentDateTime);
                    appointments.add(newAppointment);
                    break;

                case 4:
                    System.out.println("Enter doctor ID:");
                    int doctorIdForViewingAppointments = scanner.nextInt();
                    scanner.nextLine();

                    for (Appointment appointment : appointments) {
                        if (appointment.getDoctorId() == doctorIdForViewingAppointments) {
                            System.out.println(appointment.toString());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Enter patient ID:");
                    int patientIdForViewingAppointments = scanner.nextInt();
                    scanner.nextLine();

                    for (Appointment appointment : appointments) {
                        if (appointment.getPatientId() == patientIdForViewingAppointments) {
                            System.out.println(appointment.toString());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting Hospital Management System");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        }
    }
}
