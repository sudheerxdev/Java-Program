class Main {
  public static void main(String[] args) {

    // float arguments
    float start1 = 7.9f;
    System.out.println(Math.nextDown(start1));   // 7.8999996

    // double arguments
    double start2 = 7.9;
    System.out.println(Math.nextDown(start2));   // 7.8999999999999995

    // with positive infinity
    double infinity = Double.NEGATIVE_INFINITY;
    System.out.println(Math.nextDown(infinity)); // -Infinity

    // with NaN
    double nan = Math.sqrt(-5);
    System.out.println(Math.nextDown(nan));      // NaN

  }
}
