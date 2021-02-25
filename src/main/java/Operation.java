public class Operation {
    int result;
    void execute(int a, int b) {
    }
}

class addition extends Operation {

    @Override
    void execute(int a, int b) {
        result = a + b;
        System.out.println(result);
    }
}

class subtraction extends Operation {

    @Override
    void execute(int a, int b) {
        result = a - b;
        System.out.println(result);
    }
}

class multiplication extends Operation {

    @Override
    void execute(int a, int b) {
        result = a * b;
        System.out.println(result);
    }
}

class division extends Operation {

    @Override
    void execute(int a, int b) {
        result = a / b;
        System.out.println(result);
    }
}
