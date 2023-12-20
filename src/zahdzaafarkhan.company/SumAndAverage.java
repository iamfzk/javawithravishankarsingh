package FahdZaafarKhan.Company;

public class SumAndAverage {
        public static void main(String[] args) {
            // Check if there are exactly three command line arguments
            if (args.length != 3) {
                System.out.println("Error: Please provide exactly three numbers as command line arguments.");
                return;
            }

            // Extract numbers from command line arguments
            try {
                double[] numbers = new double[3];
                for (int i = 0; i < 3; i++) {
                    numbers[i] = Double.parseDouble(args[i]);
                }

                // Calculate sum and average
                double sumResult = calculateSum(numbers);
                double averageResult = calculateAverage(numbers);

                // Display results
                System.out.println("Sum: " + sumResult);
                System.out.println("Average: " + averageResult);

            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide valid numeric values as command line arguments.");
            }
        }

        private static double calculateSum(double[] numbers) {
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            return sum;
        }

        private static double calculateAverage(double[] numbers) {
            double sum = calculateSum(numbers);
            return sum / numbers.length;
        }
    }


