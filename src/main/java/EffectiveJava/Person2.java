package EffectiveJava;

/**
 * @descrition:
 * @author: cuiyy
 * @create: 2022/7/10 17:15
 **/
public class Person2 {

    private String name;         // 必填属性
    private String age;          // 选填属性
    private String sex;          // 选填属性
    private String country;      // 选填属性

    public Person2(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.country = builder.country;
    }

    public static class Builder {
        private String name;
        private String age;
        private String sex;
        private String country;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Person2 build() {
            return new Person2(this);
        }
    }
}


