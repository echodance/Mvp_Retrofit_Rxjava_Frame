package com.zq.mvp_retrofit_rxjava_frame.service.entity;

import java.util.List;

/**
 *   豆瓣图书的实体对象
 */

public class Book {


    /**
     * count : 1
     * start : 0
     * total : 815
     * books : [{"rating":{"max":10,"numRaters":216896,"average":"9.0","min":0},"subtitle":"","author":["[法] 圣埃克苏佩里"],"pubdate":"2003-8","tags":[{"count":51837,"name":"小王子","title":"小王子"},{"count":43760,"name":"童话","title":"童话"},{"count":20948,"name":"圣埃克苏佩里","title":"圣埃克苏佩里"},{"count":19019,"name":"法国","title":"法国"},{"count":18672,"name":"经典","title":"经典"},{"count":14507,"name":"外国文学","title":"外国文学"},{"count":10496,"name":"哲学","title":"哲学"},{"count":7790,"name":"小说","title":"小说"}],"origin_title":"Le Petit Prince","image":"https://img1.doubanio.com/mpic/s1237549.jpg","binding":"平装","translator":["马振聘"],"catalog":"第一卷 南渡记出版说明人物表序曲第一章 第二章第三章第四章第五章第六章第七章间曲后记第二卷 东藏记人物表\u2026\u2026间曲后记\n","pages":"97","images":{"small":"https://img1.doubanio.com/spic/s1237549.jpg","large":"https://img1.doubanio.com/lpic/s1237549.jpg","medium":"https://img1.doubanio.com/mpic/s1237549.jpg"},"alt":"https://book.douban.com/subject/1084336/","id":"1084336","publisher":"人民文学出版社","isbn10":"702004249X","isbn13":"9787020042494","title":"小王子","url":"https://api.douban.com/v2/book/1084336","alt_title":"Le Petit Prince","author_intro":"安托万·德·圣埃克苏佩里（Antoine de Saint-Exupery, 1900-1944）1900年6月29日出生在法国里昂。他曾经有志于报考海军学院，未能如愿，却有幸成了空军的一员。1923年退役后，先后从事过各种不同的职业。\n1926年，圣埃克苏佩里进入拉泰科埃尔航空公司。在此期间，出版小说《南方邮件》（1929）、《夜航》（1931），从此他在文学上声誉鹊起。1939年，又一部作品《人的大地》问世。\n第二次世界大战期间他重入法国空军。后辗转去纽约开始流亡生活。在这期间，写出《空军飞行员》、《给一个人质的信》、《小王子》（1943）等作品。1944年返回同盟国地中海空军部队。在当年7月31日的一次飞行任务中，他驾驶飞机飞上湛蓝的天空，就此再也没有回来。","summary":"小王子是一个超凡脱俗的仙童，他住在一颗只比他大一丁点儿的小行星上。陪伴他的是一朵他非常喜爱的小玫瑰花。但玫瑰花的虚荣心伤害了小王子对她的感情。小王子告别小行星，开始了遨游太空的旅行。他先后访问了六个行星，各种见闻使他陷入忧伤，他感到大人们荒唐可笑、太不正常。只有在其中一个点灯人的星球上，小王子才找到一个可以作为朋友的人。但点灯人的天地又十分狭小，除了点灯人他自己，不能容下第二个人。在地理学家的指点下，孤单的小王子来到人类居住的地球。\n小王子发现人类缺乏想象力，只知像鹦鹉那样重复别人讲过的话。小王子这时越来越思念自己星球上的那枝小玫瑰。后来，小王子遇到一只小狐狸，小王子用耐心征服了小狐狸，与它结成了亲密的朋友。小狐狸把自己心中的秘密\u2014\u2014肉眼看不见事务的本质，只有用心灵才能洞察一切\u2014\u2014作为礼物，送给小王子。用这个秘密，小王子在撒哈拉大沙漠与遇险的飞行员一起找到了生命的泉水。最后，小王子在蛇的帮助下离开地球，重新回到他的B612号小行星上。\n童话描写小王子没有被成人那骗人的世界所征服，而最终找到自己的理想。这理想就是连结宇宙万物的爱，而这种爱又是世间所缺少的。因此，小王子常常流露出一种伤感的情绪。作者圣埃克絮佩里在献辞中说：这本书是献给长成了大人的从前那个孩子。\n《小王子》不仅赢得了儿童读者，也为成年人所喜爱，作品凝练的语言渗透了作者对人类及人类文明深邃的思索。它所表现出的讽刺与幻想，真情与哲理，使之成为法国乃至世界上最为著名的一部童话小说。","price":"22.00元"}]
     */

    public int count;
    public int start;
    public int total;
    public List<Books> books;

    public static class Books {
        /**
         * rating : {"max":10,"numRaters":216896,"average":"9.0","min":0}
         * subtitle :
         * author : ["[法] 圣埃克苏佩里"]
         * pubdate : 2003-8
         * tags : [{"count":51837,"name":"小王子","title":"小王子"},{"count":43760,"name":"童话","title":"童话"},{"count":20948,"name":"圣埃克苏佩里","title":"圣埃克苏佩里"},{"count":19019,"name":"法国","title":"法国"},{"count":18672,"name":"经典","title":"经典"},{"count":14507,"name":"外国文学","title":"外国文学"},{"count":10496,"name":"哲学","title":"哲学"},{"count":7790,"name":"小说","title":"小说"}]
         * origin_title : Le Petit Prince
         * image : https://img1.doubanio.com/mpic/s1237549.jpg
         * binding : 平装
         * translator : ["马振聘"]
         * catalog : 第一卷 南渡记出版说明人物表序曲第一章 第二章第三章第四章第五章第六章第七章间曲后记第二卷 东藏记人物表……间曲后记

         * pages : 97
         * images : {"small":"https://img1.doubanio.com/spic/s1237549.jpg","large":"https://img1.doubanio.com/lpic/s1237549.jpg","medium":"https://img1.doubanio.com/mpic/s1237549.jpg"}
         * alt : https://book.douban.com/subject/1084336/
         * id : 1084336
         * publisher : 人民文学出版社
         * isbn10 : 702004249X
         * isbn13 : 9787020042494
         * title : 小王子
         * url : https://api.douban.com/v2/book/1084336
         * alt_title : Le Petit Prince
         * author_intro : 安托万·德·圣埃克苏佩里（Antoine de Saint-Exupery, 1900-1944）1900年6月29日出生在法国里昂。他曾经有志于报考海军学院，未能如愿，却有幸成了空军的一员。1923年退役后，先后从事过各种不同的职业。
         1926年，圣埃克苏佩里进入拉泰科埃尔航空公司。在此期间，出版小说《南方邮件》（1929）、《夜航》（1931），从此他在文学上声誉鹊起。1939年，又一部作品《人的大地》问世。
         第二次世界大战期间他重入法国空军。后辗转去纽约开始流亡生活。在这期间，写出《空军飞行员》、《给一个人质的信》、《小王子》（1943）等作品。1944年返回同盟国地中海空军部队。在当年7月31日的一次飞行任务中，他驾驶飞机飞上湛蓝的天空，就此再也没有回来。
         * summary : 小王子是一个超凡脱俗的仙童，他住在一颗只比他大一丁点儿的小行星上。陪伴他的是一朵他非常喜爱的小玫瑰花。但玫瑰花的虚荣心伤害了小王子对她的感情。小王子告别小行星，开始了遨游太空的旅行。他先后访问了六个行星，各种见闻使他陷入忧伤，他感到大人们荒唐可笑、太不正常。只有在其中一个点灯人的星球上，小王子才找到一个可以作为朋友的人。但点灯人的天地又十分狭小，除了点灯人他自己，不能容下第二个人。在地理学家的指点下，孤单的小王子来到人类居住的地球。
         小王子发现人类缺乏想象力，只知像鹦鹉那样重复别人讲过的话。小王子这时越来越思念自己星球上的那枝小玫瑰。后来，小王子遇到一只小狐狸，小王子用耐心征服了小狐狸，与它结成了亲密的朋友。小狐狸把自己心中的秘密——肉眼看不见事务的本质，只有用心灵才能洞察一切——作为礼物，送给小王子。用这个秘密，小王子在撒哈拉大沙漠与遇险的飞行员一起找到了生命的泉水。最后，小王子在蛇的帮助下离开地球，重新回到他的B612号小行星上。
         童话描写小王子没有被成人那骗人的世界所征服，而最终找到自己的理想。这理想就是连结宇宙万物的爱，而这种爱又是世间所缺少的。因此，小王子常常流露出一种伤感的情绪。作者圣埃克絮佩里在献辞中说：这本书是献给长成了大人的从前那个孩子。
         《小王子》不仅赢得了儿童读者，也为成年人所喜爱，作品凝练的语言渗透了作者对人类及人类文明深邃的思索。它所表现出的讽刺与幻想，真情与哲理，使之成为法国乃至世界上最为著名的一部童话小说。
         * price : 22.00元
         */

        public Rating rating;
        public String subtitle;
        public String pubdate;
        public String origin_title;
        public String image;
        public String binding;
        public String catalog;
        public String pages;
        public Images images;
        public String alt;
        public String id;
        public String publisher;
        public String isbn10;
        public String isbn13;
        public String title;
        public String url;
        public String alt_title;
        public String author_intro;
        public String summary;
        public String price;
        public List<String> author;
        public List<Tags> tags;
        public List<String> translator;

        public static class Rating {
            /**
             * max : 10
             * numRaters : 216896
             * average : 9.0
             * min : 0
             */

            public int max;
            public int numRaters;
            public String average;
            public int min;
        }

        public static class Images {
            /**
             * small : https://img1.doubanio.com/spic/s1237549.jpg
             * large : https://img1.doubanio.com/lpic/s1237549.jpg
             * medium : https://img1.doubanio.com/mpic/s1237549.jpg
             */

            public String small;
            public String large;
            public String medium;
        }

        public static class Tags {
            /**
             * count : 51837
             * name : 小王子
             * title : 小王子
             */

            public int count;
            public String name;
            public String title;
        }
    }
}
