package StreamAPI;

import java.util.*;
import java.util.stream.*;
public class Insurance {
    static class Claim {
        String claimId;
        String claimantName;
        String claimType;
        double claimAmount;
        String status;
        String region;
        int year;

        Claim(String claimId, String claimantName, String claimType,
              double claimAmount, String status, String region, int year) {
            this.claimId = claimId;
            this.claimantName = claimantName;
            this.claimType = claimType;
            this.claimAmount = claimAmount;
            this.status = status;
            this.region = region;
            this.year = year;
        }

        String getClaimType() {
            return claimType;
        }

        double getClaimAmount() {
            return claimAmount;
        }

        String getStatus() {
            return status;
        }

        String getRegion() {
            return region;
        }

        int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return String.format(
                    "  %-8s | %-22s | %-15s | ₹%10.2f | %-10s | %-10s | %d",
                    claimId, claimantName, claimType, claimAmount, status, region, year
            );
        }
    }

    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("CLM-001", "Aryan Mehta", "Health", 45000.00, "Approved", "North", 2023),
                new Claim("CLM-002", "Priya Sharma", "Vehicle", 82000.00, "Pending", "South", 2023),
                new Claim("CLM-003", "Ravi Kumar", "Property", 150000.00, "Approved", "East", 2024));
    }
}