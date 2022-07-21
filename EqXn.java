package aula7;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    //#region método de acesso
    public double getXn(Delta delta) {
        xn = (-delta.getB() - Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xn;
    }
    public void setXn(double xn) {
        this.xn = xn;
    }
    public double getXp(Delta delta) {
        xp = (-delta.getB() + Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xp;
    }
    public void setXp(double xp) {
        this.xp = xp;
    }
    //#endregion
    //#region regra de negócio
    public void calculaXn() {

    }
    public void calculaXp() {

    }
    //#endregion
}

