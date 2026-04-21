package StreamAPI;

import java.util.*;
import java.util.stream.*;
public class Hospital {
    static class Doctor {
        String name;
        String specialty;
        String department;
        double experience;   // years
        boolean availableOnWeekend;
        String contact;

        Doctor(String name, String specialty, String department,
               double experience, boolean availableOnWeekend, String contact) {
            this.name = name;
            this.specialty = specialty;
            this.department = department;
            this.experience = experience;
            this.availableOnWeekend = availableOnWeekend;
            this.contact = contact;
        }

        String getSpecialty() {
            return specialty;
        }

        boolean isWeekend() {
            return availableOnWeekend;
        }

        @Override
        public String toString() {
            return String.format(
                    "  %-25s | %-18s | Dept: %-15s | Exp: %4.1f yrs | Contact: %s",
                    name, specialty, department, experience, contact
            );
        }
    }

    public static void main(String[] args) {
        List<Doctor> allDoctors = Arrays.asList(
                new Doctor("Dr. Aryan Mehta", "Cardiology", "Heart Care", 12.0, true, "ext-101"),
                new Doctor("Dr. Priya Sharma", "Neurology", "Brain & Spine", 8.5, false, "ext-102"),
                new Doctor("Dr. Ravi Kumar", "Orthopedics", "Bone & Joint", 15.0, true, "ext-103"),
                new Doctor("Dr. Sneha Iyer", "Pediatrics", "Child Health", 6.0, true, "ext-104"),
                new Doctor("Dr. Anil Verma", "Dermatology", "Skin Care", 9.0, false, "ext-105"),
                new Doctor("Dr. Meena Pillai", "Gynecology", "Women's Health", 11.0, true, "ext-106"),
                new Doctor("Dr. Suresh Nair", "Cardiology", "Heart Care", 7.0, false, "ext-107"));


    }
}