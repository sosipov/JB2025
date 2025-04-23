package com.colvir.lesson4.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dinosaur {
    public Dinosaur() {
    }

    private Integer ageAgoFrom;
    private Integer ageAgoTo;
    private Integer maxLength;
    private Integer maxHeight;
    private String description;

    private Dinosaur(Builder builder) {
        this.ageAgoFrom = builder.ageAgoFrom;
        this.ageAgoTo = builder.ageAgoTo;
        this.maxLength = builder.maxLength;
        this.maxHeight = builder.maxHeight;
        this.description = builder.description;
    }

    public Integer getAgeAgoFrom() {
        return ageAgoFrom;
    }

    public Integer getAgeAgoTo() {
        return ageAgoTo;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public String getDescription() {
        return description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer ageAgoFrom;
        private Integer ageAgoTo;
        private Integer maxLength;
        private Integer maxHeight;
        private String description;

        public Builder ageAgoFrom(Integer ageAgoFrom) {
            this.ageAgoFrom = ageAgoFrom;
            return this;
        }

        public Builder ageAgoTo(Integer ageAgoTo) {
            this.ageAgoTo = ageAgoTo;
            return this;
        }

        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public Builder maxHeight(Integer maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Dinosaur build() {
            return new Dinosaur(this);
        }
    }

}
