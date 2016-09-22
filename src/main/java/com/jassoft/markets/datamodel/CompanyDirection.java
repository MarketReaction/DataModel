package com.jassoft.markets.datamodel;

public class CompanyDirection {
        private String companyId;
        private Direction direction;

        public CompanyDirection(String companyId, Direction direction) {
            this.companyId = companyId;
            this.direction = direction;
        }

        public String getCompanyId() {
            return companyId;
        }

        public Direction getDirection() {
            return direction;
        }
    }