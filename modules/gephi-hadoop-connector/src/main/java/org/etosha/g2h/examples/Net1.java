package org.etosha.g2h.examples;

/**
 *
 * @author kamir
 */
public class Net1 {
    
    static public String defaultNQ = "SELECT DISTINCT SOURCE AS id, '?' as url FROM facebook_example UNION SELECT distinct TARGET AS id, '?' as url FROM facebook_example;";
    static public String defaultEQ = "SELECT SOURCE AS source, TARGET AS target, concat( cast(source as string), '-', cast(target as string)) AS label, '1' AS weight FROM facebook_example;";

}
