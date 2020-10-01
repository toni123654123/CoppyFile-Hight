package coppyfile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter destination file: ");
        String desPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(desPath);

        try {
//            CoppyFile.copyFileUsingJava7Files(sourceFile, destFile);
           CoppyFile.copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy completed");
        } catch (IOException e) {
            System.out.println("Can't copy that file");
            System.out.println(e.getMessage());
        }

    }
}
