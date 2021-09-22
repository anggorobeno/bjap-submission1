package com.example.myviewmodel.utils;

import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.model.TvEntity;

import java.util.ArrayList;

public class DummyData {
    public static ArrayList<MovieEntity> generateDummyMovie(){
        ArrayList<MovieEntity> movie = new ArrayList<>();
        movie.add(new MovieEntity("1",
                "Pacific Rim",
                "In 2013, alien monsters called Kaiju emerge from an interdimensional portal called \"The Breach\" at the bottom of the Pacific Ocean. In response, humanity builds massive robots called Jaegers, each is co-piloted by two or more people, who share a mental link via a process called \"Drifting\" to share the mental stress of piloting the machine. ",
                "https://www.dicoding.com/images/small/academy/menjadi_android_developer_expert_logo_070119140352.jpg"));
        movie.add(new MovieEntity("2",
                "Pacific Rim Uprising",
                "It is 2035, ten years after the Battle of the Breach, in which the interdimensional portal created by the Precursors (through which they sent marauding Kaiju) was closed.[b] Former Jaeger pilot Jake Pentecost—son of Stacker Pentecost—makes a living by stealing and selling Jaeger parts on the black market in Santa Monica, California.",
                "https://www.dicoding.com/images/small/academy/kotlin_android_developer_expert_logo_070119140227.jpg"));
        movie.add(new MovieEntity("3",
                "The Mist",
                "A freak storm unleashes a species of bloodthirsty creatures on a small town, where a small band of citizens hole up in a supermarket and fight for their lives.",
                "https://www.dicoding.com/images/small/academy/menjadi_game_developer_expert_logo_070119140532.jpg"));
        movie.add(new MovieEntity("4",
                "Upgrade",
                "Set in the near-future, technology controls nearly all aspects of life. But when the world of Grey, a self-labeled technophobe, is turned upside down, his only hope for revenge is an experimental computer chip implant.",
                "https://www.dicoding.com/images/small/academy/membangun_progressive_web_apps_logo_070119142922.jpg"));
        movie.add(new MovieEntity("5",
                "Love and Monsters",
                "Seven years after he survived the monster apocalypse, lovably hapless Joel leaves his cozy underground bunker behind on a quest to reunite with his ex.",
                "https://www.dicoding.com/images/small/academy/belajar_membuat_aplikasi_android_untuk_pemula_logo_070119140911.jpg"));
        movie.add(new MovieEntity("6",
                "Captain Phillips",
                "The true story of Captain Richard Phillips and the 2009 hijacking by Somali pirates of the U.S.-flagged MV Maersk Alabama, the first American cargo ship to be hijacked in two hundred years.",
                ""));
        movie.add(new MovieEntity("7",
                "Spider-Man",
                "When bitten by a genetically modified spider, a nerdy, shy, and awkward high school student gains spider-like abilities that he eventually must use to fight evil as a superhero after tragedy befalls his family.",
                ""));
        movie.add(new MovieEntity("8",
                "Spider-Man 2",
                "Peter Parker is beset with troubles in his failing personal life as he battles a brilliant scientist named Doctor Otto Octavius.",
                ""));
        movie.add(new MovieEntity("9",
                "Spider-Man 3",
                "A strange black entity from another world bonds with Peter Parker and causes inner turmoil as he contends with new villains, temptations, and revenge.",
                ""));
        movie.add(new MovieEntity("10",
                "Spider-Man Far From Home",
                "Following the events of Avengers: Endgame (2019), Spider-Man must step up to take on new threats in a world that has changed forever.",
                ""));
        return movie;
    }
    public static ArrayList<TvEntity>  generateDummyTv(){
        ArrayList<TvEntity> tv = new ArrayList<>();
        tv.add(new TvEntity("1",
                "Lucifer",
                "Lucifer Morningstar has decided he's had enough of being the dutiful servant in Hell and decides to spend some time on Earth to better understand humanity. He settles in Los Angeles - the City of Angels.",
                ""));
        tv.add(new TvEntity("2",
                "Hawkeye",
                "Series based on the Marvel Comics superhero Hawkeye, centering on the adventures of Young Avenger, Kate M. Bishop, who took on the role after the original Avenger, Clint Barton.",
                ""));
        tv.add(new TvEntity("3",
                "What If...?",
                "Exploring pivotal moments from the Marvel Cinematic Universe and turning them on their head, leading the audience into uncharted territory.",
                ""));
        tv.add(new TvEntity("4",
                "Ted Lasso",
                "Follows an American football coach Ted Lasso who heads to the U.K. to manage a struggling London football team in the top flight of English football.",
                ""));
        tv.add(new TvEntity("5",
                "The Walking Dead",
                "Sheriff Deputy Rick Grimes wakes up from a coma to learn the world is in ruins and must lead a group of survivors to stay alive.",
                ""));
        tv.add(new TvEntity("6",
                "CLickbait",
                "When family man, Nick Brewer, is abducted in a crime with a sinister online twist, those closest to him race to uncover who is behind it and why.",
                ""));
        tv.add(new TvEntity("7",
                "Money Heist",
                "An unusual group of robbers attempt to carry out the most perfect robbery in Spanish history - stealing 2.4 billion euros from the Royal Mint of Spain.",
                ""));
        tv.add(new TvEntity("8",
                "Perfect Strangers",
                "Nine stressed city dwellers visit a boutique health-and-wellness resort that promises healing and transformation. The resort's director is a woman on a mission to reinvigorate their tired minds and bodies.",
                ""));
        tv.add(new TvEntity("9",
                "Only Murders in The Building",
                "Three strangers who share an obsession with true crime suddenly find themselves caught up in one.",
                ""));
        tv.add(new TvEntity("10".
                "American Horror Story",
                "An anthology series centering on different characters and locations, including a house with a murderous past, an insane asylum, a witch coven, a freak show circus, a haunted hotel, a possessed farmhouse, a cult, the apocalypse, a slasher summer camp, and a bleak beach town and desert valley.",
                ""));
        return tv;
    }
}

