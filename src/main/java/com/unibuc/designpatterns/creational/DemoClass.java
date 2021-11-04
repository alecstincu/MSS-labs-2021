package com.unibuc.designpatterns.creational;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoClass {
    private String property1;
    private List<String> property2;
    private boolean property3;
    private Integer property4;
    private Long property5;
    private String property6;
    private String property7;
    private String property8;
    private String property9;
    private Double property10;
    private AtomicInteger property11;
    private String property12;
    private Integer property13;
    private Integer property14;

    DemoClass(DemoClassBuilder demoClassBuilder) {
        this.property1 = demoClassBuilder.property1;
        this.property2 = demoClassBuilder.property2;
        this.property3 = demoClassBuilder.property3;
        this.property4 = demoClassBuilder.property4;
        this.property5 = demoClassBuilder.property5;
        this.property6 = demoClassBuilder.property6;
        this.property7 = demoClassBuilder.property7;
        this.property8 = demoClassBuilder.property8;
        this.property9 = demoClassBuilder.property9;
        this.property10 = demoClassBuilder.property10;
        this.property11 = demoClassBuilder.property11;
        this.property12 = demoClassBuilder.property12;
        this.property13 = demoClassBuilder.property13;
        this.property14 = demoClassBuilder.property14;
    }

    @Override
    public String toString() {
        return "DemoClass{" +
                "property1='" + property1 + '\'' +
                ", property2=" + property2 +
                ", property3=" + property3 +
                ", property4=" + property4 +
                ", property5=" + property5 +
                ", property6='" + property6 + '\'' +
                ", property7='" + property7 + '\'' +
                ", property8='" + property8 + '\'' +
                ", property9='" + property9 + '\'' +
                ", property10=" + property10 +
                ", property11=" + property11 +
                ", property12='" + property12 + '\'' +
                ", property13=" + property13 +
                ", property14=" + property14 +
                '}';
    }

    public static DemoClass.DemoClassBuilder builder() {
        return new DemoClass.DemoClassBuilder();
    }

    public static class DemoClassBuilder {
        private String property1;
        private List<String> property2;
        private boolean property3;
        private Integer property4;
        private Long property5;
        private String property6;
        private String property7;
        private String property8;
        private String property9;
        private Double property10;
        private AtomicInteger property11;
        private String property12;
        private Integer property13;
        private Integer property14;

        DemoClassBuilder() {
        }

        public DemoClass.DemoClassBuilder property1(String property1) {
            this.property1 = property1;
            return this;
        }

        public DemoClass.DemoClassBuilder property2(List<String> property2) {
            this.property2 = property2;
            return this;
        }

        public DemoClass.DemoClassBuilder property3(boolean property3) {
            this.property3 = property3;
            return this;
        }

        public DemoClass.DemoClassBuilder property4(Integer property4) {
            this.property4 = property4;
            return this;
        }

        public DemoClass.DemoClassBuilder property5(Long property5) {
            this.property5 = property5;
            return this;
        }

        public DemoClass.DemoClassBuilder property6(String property6) {
            this.property6 = property6;
            return this;
        }

        public DemoClass.DemoClassBuilder property7(String property7) {
            this.property7 = property7;
            return this;
        }

        public DemoClass.DemoClassBuilder property8(String property8) {
            this.property8 = property8;
            return this;
        }

        public DemoClass.DemoClassBuilder property9(String property9) {
            this.property9 = property9;
            return this;
        }

        public DemoClass.DemoClassBuilder property10(Double property10) {
            this.property10 = property10;
            return this;
        }

        public DemoClass.DemoClassBuilder property11(AtomicInteger property11) {
            this.property11 = property11;
            return this;
        }

        public DemoClass.DemoClassBuilder property12(String property12) {
            this.property12 = property12;
            return this;
        }

        public DemoClass.DemoClassBuilder property13(Integer property13) {
            this.property13 = property13;
            return this;
        }

        public DemoClass.DemoClassBuilder property14(Integer property14) {
            this.property14 = property14;
            return this;
        }

        public DemoClass build() {
            return new DemoClass(this);
        }
    }
}

class MainBuilder {
    public static void main(String[] args) {
        System.out.println(DemoClass.builder()
                .property1("ABC")
                .build());

        System.out.println(DemoClass.builder()
                .property3(true)
                .property14(1)
                .build());
    }
}
