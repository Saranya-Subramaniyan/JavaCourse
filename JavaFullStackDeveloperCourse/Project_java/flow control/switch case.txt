package org.example.flowControl;

public class SwitchCase {
        public static void main(String[] args) {
            String name = "Editor";

            switch (name.toLowerCase()) {
                case "author" -> System.out.println("saranya");
                case "team" -> System.out.println("Team example");
                case "editor" -> System.out.println("saran and saru");
                default -> System.out.println("Invalid entry");
            }

        }
    }
