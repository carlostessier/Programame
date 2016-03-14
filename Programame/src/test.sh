#/bin/bash
javac Reversibles/main.java
java Reversibles.Main < sample.in > prueba.out
diff prueba.out sample.out -q
