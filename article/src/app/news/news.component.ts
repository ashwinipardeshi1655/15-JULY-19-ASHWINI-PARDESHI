import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  newsData: any='';

  news = [
            {
              title : "Haryana Steelers Stage Comeback Against Patna Pirates" ,
              image : "https://images.news18.com/ibnlive/uploads/2019/08/Sports-341.png" ,
              description : "Patna: After three consecutive losses, Haryana Steelers staged a big comeback, beating Patna Pirates 35-26 in Patna on Wednesday. Raider Vikash Kandola starred for the visiting team, scoring 10 points.The return of Vikash against Tamil Thalaivas was a major boost in confidence for the Steelers. They got off to a fine start, taking an eight point lead in the first 10 minutes of the match. Dharmaraj Cheralathan and Vikas Kale ensured that the raiders of the Pirates were at bay and not scoring easy points." 
            },
            {
              title : "RBI moves unlikely to ease pain for India's struggling NBFCs" ,
              image : "https://images.livemint.com/img/2019/08/07/600x338/342136838_0-6_1565207719851_1565207733544.jpg" ,
              description : "Analysts say priority sector lending rules tweak may help smaller NBFCs but won't favour bigger shadow banks. NBFCs have been battling a credit crunch since IL&FS collapsed in late 2018 amid fraud allegations" 
            },
            {
              title : "Relentless Rain Savages Maharashtra; 6 Killed, 400 Stranded" ,
              image : "https://images.news18.com/ibnlive/uploads/877x0/jpg/2019/07/Mumbai-Rain-floods-india-_2.jpg" ,
              description : "Commuters hold hands and walk past flooded train tracks in Mumbai. Heavy rainfall in India's commercial capital disrupted normal life, prompting authorities to close schools and colleges.At least six persons were killed in Mumbai and Satara as rains continued to clobber large stretches of Maharashtra, especially the coastal Konkan region, on Sunday (August 04), hitting train services badly. " 
            },
            {
              title : "Amit Shah raises concerns with Bangladesh over illegal immigration" ,
              image : "https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/Amit_shah-770x433.png?sa11diBj0UL40c6XSsQ5EkV7CYVum9O6" ,
              description : "ome Minister Amit Shah on Wednesday raised with Bangladesh India's concerns over illegal immigration from that country to the Northeast.The issue was flagged before Bangladesh Home Minister Asaduzzaman Khan at the7th meeting of India-Bangladesh Home Minister Level Talks (HMLT) here.Shah raised India's concern regarding the illicit movement of people across the border, with a view to find solutions to this problem especially in Northeast India, an official statement said." 
            },
            {
              title : "Nearly 26,000 people evacuated in Karnataka, 5 dead in rain fury" ,
              image : "https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/rain___0-770x433.png?AFUovqd9g8HZ4cRu071WOBS5PgxSvhqH" ,
              description : "he flood situation in parts of Karnataka remained grim on Wednesday with nearly 26,000 people being evacuated and five people killed in rain-related incidents in the past three days, official sources said. The situation continued to remain grim as the floodgates were opened in the dams in neighbouring Maharashtra and barrages and reservoirs in Karnataka, where road and rail links remain hit following incessant monsoon rains." 
            },
            {
              title : "Mumbai rains | 10 trains cancelled" ,
              image : "https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/rain2-770x433.png?0pCXjhRqMZh086eOfITvl.DmIkWRHtjW" ,
              description : "Normal life in the city of Mumbai came to a standstill due to Mumbai rains for the past two days as the city got battered by heavy rainfall during the weekend. Not just Mumbai but other states including Gujarat, Bihar and Andhra Pradesh are also witnessing heavy rains. NDRF teams have been deployed for rescue operations in several districts." 
            }
  ]
  constructor() { }

  sendNews(i){
    this.newsData = i;
  }

  ngOnInit() {
  }

}
