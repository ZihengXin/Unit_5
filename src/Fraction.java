
    /**
     * This class accounts for fractions, including a constructor, a default constructor, and methods to do Fraction calculations (+.-,*,/)
     * @author Charly Xin
     * @since February 11, 2020
     */
    public class Fraction {
        /**
         * initialize variable
         *
         * @param numerator
         * @param denominator
         */
        private int numerator;
        private int denominator;

        /**
         * The first constructor makes a fraction with a given numerator and denominator given by user, check negatives and simplifies
         *
         * @param numerator
         * @param denominator
         */
        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            int num = reduce(numerator, denominator);
            denominator /= num;
            numerator /= num;

            if (denominator < 0 && numerator > 0) {
                denominator *= -1;
                numerator *= -1;
            } else if (denominator < 0 && numerator < 0)
                denominator *= -1;

        }

        /**
         * the initialized fraction 1/1
         */
        public Fraction() {
            this(1,1);
        }

        /**
         * @param m numerator
         * @param n denominator
         * @return find the common divider
         */
        private static int gcd(int m, int n) {
            while (m % n != 0) {
                int oldm = m;
                int oldn = n;

                m = oldn;
                n = oldm % oldn;
            }
            return n;
        }

        /**
         * reduce the given fraction
         *
         * @param numerator
         * @param denominator
         * @return the reduced numerator and denominator
         */
        private static int reduce(int numerator, int denominator) {
            int commonDivider = gcd(numerator, denominator);

            return commonDivider;
        }

        /**
         * Multiplies the denominators and numerators by the opposite denominators then adds them and reduce
         *
         * @param a fraction one
         * @param b fraction two
         * @return the simplified added fraction
         */
        public static Fraction add(Fraction a, Fraction b) {
            int newDenominator = a.denominator * b.denominator;
            int newNumerator = a.numerator * b.denominator + a.denominator * b.numerator;
            int num = reduce(newNumerator, newDenominator);
            newDenominator /= num;
            newNumerator /= num;
            if (newDenominator < 0 && newNumerator > 0) {
                newDenominator *= -1;
                newNumerator *= -1;
            } else if (newDenominator < 0 && newNumerator < 0)
                newDenominator *= -1;
            return new Fraction(newNumerator, newDenominator);
        }

        /**
         * Multiplies the denominators and the numerators by the opposite denominators then adds them and reduce
         *
         * @param a fraction one
         * @param b fraction two
         * @return the simplified subtract fraction
         */
        public static Fraction subtract(Fraction a, Fraction b) {
            int newDenominator = a.denominator * b.denominator;
            int newNumerator = a.numerator * b.denominator - a.denominator * b.numerator;
            int num = reduce(newNumerator, newDenominator);
            newDenominator /= num;
            newNumerator /= num;
            if (newDenominator < 0 && newNumerator > 0) {
                newDenominator *= -1;
                newNumerator *= -1;
            } else if (newDenominator < 0 && newNumerator < 0)
                newDenominator *= -1;
            return new Fraction(newNumerator, newDenominator);
        }
        /**
         * Multiplies numerators and denominators, and reduce them
         * @param a fraction one
         * @param b fraction two
         * @return the simplified multiply fraction
         */
        public static Fraction multiply(Fraction a, Fraction b){
            int newNumerator = a.numerator * b. numerator;
            int newDenominator = a.denominator * b. denominator;
            int num = reduce(newNumerator, newDenominator);
            newDenominator /= num;
            newNumerator /= num;
            if(newDenominator < 0 && newNumerator > 0) {
                newDenominator *= -1;
                newNumerator *= -1;
            }
            else if(newDenominator < 0 && newNumerator < 0)
                newDenominator *= -1;
            return new Fraction(newNumerator, newDenominator);
        }

        /**
         * Multiplies numerators and denominators, and reduce them
         * @param a fraction one
         * @param b fraction two
         * @return the simplified divide fraction
         */
        public static Fraction divide(Fraction a, Fraction b){
            int newNumerator = a.numerator * b.denominator;
            int newDenominator = a.denominator * b.numerator;
            int num = reduce(newNumerator, newDenominator);
            newDenominator /= num;
            newNumerator /= num;
            return new Fraction(newNumerator, newDenominator);
        }

        /**
         *
         * @return the assign output
         */
        public String toString(){

            if(denominator < 0 && numerator > 0) {
                denominator *= -1;
                numerator *= -1;
            }
            else if(denominator < 0 && numerator < 0)
                denominator *= -1;
            return numerator + "/" + denominator;
        }
}
