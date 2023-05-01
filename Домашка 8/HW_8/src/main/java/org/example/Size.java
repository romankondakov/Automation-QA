package org.example;

public enum Size {
            SMALL("S", 10, 30),
            MEDIUM("M", 20, 40),
            LARGE("L", 30, 50),
            EXTRA_LARGE("XL", 40, 60);

            private final String abbreviation;
            private final int width;
            private final int length;

            private Size(String abbreviation, int width, int length) {
                this.abbreviation = abbreviation;
                this.width = width;
                this.length = length;
            }

            public String getAbbreviation() {
                return abbreviation;
            }

            public int getWidth() {
                return width;
            }

            public int getLength() {
                return length;
            }

            @Override
            public String toString() {
                return name() + " size: width=" + width + ", length=" + length;
            }
        }



