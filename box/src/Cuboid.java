public class Cuboid {
  int aSide;
  int bSide;
  int cSide;

  public int getSurface() {
    return ((aSide*bSide)+(bSide*cSide)+(cSide*aSide))*2;
  }

  public int getVolume() {
    return aSide*bSide*cSide;
  }

  public Cuboid(int aSide, int bSide, int cSide) {
    this.aSide = aSide;
    this.bSide = bSide;
    this.cSide = cSide;
  }
}
