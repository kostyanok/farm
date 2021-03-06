package model;

public enum Error {
    OUT_OF_FARM("The animal is located out of the farm"),
    DOG_IS_IN_SHEEPS_AREA("The dog is in the sheep pen"),
    WRONG_ANIMAL("It is a wrong kind of animals for the farm");

    private String error;

    Error(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return error;
    }
}
