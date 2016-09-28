/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.jassoft.markets.datamodel.system;

/**
 *
 * @author Jonny
 */
public enum Queue
{
//    Crawler
    Crawler,
    Stories,
    FoundCompany,
//    Collect
    StoriesWithContent,
    CompanyWithInformation,
//    Analyse
    IndexedStory,
    IndexedCompany,
    //Match
    MatchFound,
    QuoteUpdated,

    ExclusionAdded,
    MissingQuoteData,

    FindCompanies
}
