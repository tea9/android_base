package com.demo.android_base.demo.entity;

import java.util.List;

/**
 * created by tea9 at 2018/12/13
 */
public class ClassifyBean {

    /**
     * status : 200
     * info :
     * data : {"my":[{"league_id":"257","league_name":"BTC漲跌幅預測 UTC+8  24H"}],"categorys":[{"cat_id":"0","cat_name":"推薦分類","leagues":[{"league_id":"257","league_name":"BTC漲跌幅預測 UTC+8  24H","league_logo":"https://img.3bike.net/uploads/league/logo/20181212/5c1086e87a057.jpg","today_match_count":"0"}]},{"cat_id":"1","cat_name":"足球","leagues":[{"league_id":"3","league_name":"中超","league_logo":"","today_match_count":"0"},{"league_id":"7","league_name":"英超","league_logo":"","today_match_count":"0"},{"league_id":"8","league_name":"意甲","league_logo":"","today_match_count":"0"},{"league_id":"9","league_name":"西甲","league_logo":"","today_match_count":"0"},{"league_id":"10","league_name":"德甲","league_logo":"","today_match_count":"0"},{"league_id":"11","league_name":"法甲","league_logo":"","today_match_count":"0"},{"league_id":"14","league_name":"亞冠","league_logo":"","today_match_count":"0"},{"league_id":"15","league_name":"歐冠","league_logo":"","today_match_count":"0"},{"league_id":"17","league_name":"歐聯杯","league_logo":"","today_match_count":"0"},{"league_id":"27","league_name":"友誼賽","league_logo":"","today_match_count":"0"},{"league_id":"34","league_name":"足協杯","league_logo":"","today_match_count":"0"},{"league_id":"39","league_name":"國際冠軍杯","league_logo":"","today_match_count":"0"},{"league_id":"45","league_name":"K聯賽","league_logo":"","today_match_count":"0"},{"league_id":"46","league_name":"日職聯","league_logo":"","today_match_count":"0"},{"league_id":"47","league_name":"南美解放者杯","league_logo":"","today_match_count":"0"},{"league_id":"48","league_name":"巴甲","league_logo":"","today_match_count":"0"},{"league_id":"49","league_name":"阿超","league_logo":"","today_match_count":"0"},{"league_id":"55","league_name":"美職聯","league_logo":"","today_match_count":"0"},{"league_id":"57","league_name":"足球友誼賽","league_logo":"","today_match_count":"0"},{"league_id":"84","league_name":"中甲","league_logo":"","today_match_count":"0"},{"league_id":"85","league_name":"亞足聯","league_logo":"","today_match_count":"0"},{"league_id":"97","league_name":"阿根廷甲級聯賽","league_logo":"","today_match_count":"0"},{"league_id":"98","league_name":"英聯杯","league_logo":"","today_match_count":"0"},{"league_id":"104","league_name":"以超","league_logo":"","today_match_count":"0"},{"league_id":"112","league_name":"國王杯","league_logo":"","today_match_count":"0"},{"league_id":"113","league_name":"墨西哥杯","league_logo":"","today_match_count":"0"},{"league_id":"116","league_name":"中乙","league_logo":"","today_match_count":"0"},{"league_id":"117","league_name":"歐洲國家聯賽","league_logo":"","today_match_count":"0"},{"league_id":"118","league_name":"英甲","league_logo":"","today_match_count":"0"},{"league_id":"119","league_name":"日職乙","league_logo":"","today_match_count":"0"},{"league_id":"121","league_name":"芬甲","league_logo":"","today_match_count":"0"},{"league_id":"122","league_name":"歐青U19","league_logo":"","today_match_count":"0"},{"league_id":"126","league_name":"芬超","league_logo":"","today_match_count":"0"},{"league_id":"131","league_name":"西乙","league_logo":"","today_match_count":"0"},{"league_id":"133","league_name":"德乙","league_logo":"","today_match_count":"0"},{"league_id":"134","league_name":"英冠","league_logo":"","today_match_count":"0"},{"league_id":"136","league_name":"俄超","league_logo":"","today_match_count":"0"},{"league_id":"138","league_name":"荷蘭杯","league_logo":"","today_match_count":"0"}]}]}
     */

    private int status;
    private String info;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<MyBean> my;
        private List<CategorysBean> categorys;

        public List<MyBean> getMy() {
            return my;
        }

        public void setMy(List<MyBean> my) {
            this.my = my;
        }

        public List<CategorysBean> getCategorys() {
            return categorys;
        }

        public void setCategorys(List<CategorysBean> categorys) {
            this.categorys = categorys;
        }

        public static class MyBean {
            /**
             * league_id : 257
             * league_name : BTC漲跌幅預測 UTC+8  24H
             */

            private String league_id;
            private String league_name;
            public boolean flag =false;

            public String getLeague_id() {
                return league_id;
            }

            public void setLeague_id(String league_id) {
                this.league_id = league_id;
            }

            public String getLeague_name() {
                return league_name;
            }

            public void setLeague_name(String league_name) {
                this.league_name = league_name;
            }
        }

        public static class CategorysBean {
            /**
             * cat_id : 0
             * cat_name : 推薦分類
             * leagues : [{"league_id":"257","league_name":"BTC漲跌幅預測 UTC+8  24H","league_logo":"https://img.3bike.net/uploads/league/logo/20181212/5c1086e87a057.jpg","today_match_count":"0"}]
             */

            private String cat_id;
            private String cat_name;
            private List<LeaguesBean> leagues;
//            private boolean check=false;
//
//            public void setCheck(boolean check) {
//                this.check = check;
//            }
//
//            public boolean isCheck() {
//                return check;
//            }

            public String getCat_id() {
                return cat_id;
            }

            public void setCat_id(String cat_id) {
                this.cat_id = cat_id;
            }

            public String getCat_name() {
                return cat_name;
            }

            public void setCat_name(String cat_name) {
                this.cat_name = cat_name;
            }

            public List<LeaguesBean> getLeagues() {
                return leagues;
            }

            public void setLeagues(List<LeaguesBean> leagues) {
                this.leagues = leagues;
            }

            public static class LeaguesBean {
                /**
                 * league_id : 257
                 * league_name : BTC漲跌幅預測 UTC+8  24H
                 * league_logo : https://img.3bike.net/uploads/league/logo/20181212/5c1086e87a057.jpg
                 * today_match_count : 0
                 */

                private String league_id;
                private String league_name;
                private String league_logo;
                private String today_match_count;
                private boolean check;

                public boolean isCheck() {
                    return check;
                }

                public void setCheck(boolean check) {
                    this.check = check;
                }

                public String getLeague_id() {
                    return league_id;
                }

                public void setLeague_id(String league_id) {
                    this.league_id = league_id;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getLeague_logo() {
                    return league_logo;
                }

                public void setLeague_logo(String league_logo) {
                    this.league_logo = league_logo;
                }

                public String getToday_match_count() {
                    return today_match_count;
                }

                public void setToday_match_count(String today_match_count) {
                    this.today_match_count = today_match_count;
                }
            }
        }
    }
}
