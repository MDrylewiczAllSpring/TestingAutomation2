package pages;


import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class homePage extends pagesMain {

    public String toolbar = "/html/body/div[1]/app-root/app-layout/div/mat-toolbar/mat-toolbar-row[2]/div[2]";
    public String upperLogo = "//*[@id='logo']";
    public String upperRemi = "/html/body/div[1]/app-root/app-layout/div/mat-toolbar/mat-toolbar-row[1]/div/mat-grid-list/div/mat-grid-tile[1]/figure";
    public String welcomeUser = "/html/body/div[1]/app-root/app-layout/div/mat-toolbar/mat-toolbar-row[1]/div/mat-grid-list/div/mat-grid-tile[2]/figure";
    public String sandwichMenu = "//*[@id='menu']/span/mat-icon";
    public String gear = "/html/body/div[1]/app-root/app-layout/div/mat-toolbar/mat-toolbar-row[2]/div[2]/button[1]/span/mat-icon";
    public String help = "/html/body/div[1]/app-root/app-layout/div/mat-toolbar/mat-toolbar-row[2]/div[2]/button[2]/span/mat-icon";
    public String bell = "/html/body/div[1]/app-root/app-layout/div/mat-toolbar/mat-toolbar-row[2]/div[2]/button[3]/span/span/mat-icon";
    public String account = "/html/body/div[1]/app-root/app-layout/div/mat-toolbar/mat-toolbar-row[2]/div[2]/button[4]/span/mat-icon";
    public String welcomeRemi = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-home/div/div[1]";
    public String pageLogo = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-home/div/div[2]/div/div[1]";
    public String supportedFeatures = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-home/div/div[2]/div/div[2]";
    public String table = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-home/div/div[2]/div/div[3]";
    public String contact = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-home/div/div[2]/div/div[4]";
    public String home = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[1]/a/div";
    public String dashboard = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[2]/a/div";
    public String transitionAnalysis = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[3]/a/div";
    public String templateImport = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[3]/div/app-menu[1]/a/div";
    public String viewImportedTemplates = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[3]/div/app-menu[2]/a/div";
    public String transitionPlanReports = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[3]/div/app-menu[3]/a/div";
    public String optimization = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[4]/a/div";
    public String runStatus = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[4]/div/app-menu[1]/a/div";
    public String ahrTransitionAcct = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[4]/div/app-menu[2]/a/div";
    public String ahrActiveAcct = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[4]/div/app-menu[3]/a/div";
    public String trading = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[5]/a/div";
    public String approveTrades = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[5]/div/app-menu[1]/a/div";
    public String viewWorkingTrades = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[5]/div/app-menu[2]/a/div";
    public String smaDataMaintenance = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/a";
    public String portfolioSpecs = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[1]/a/div";
    public String referencePortfolio = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[2]/a/div";
    public String smaBenchmarks = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[3]/a/div";
    public String riskModel = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[4]/a/div";
    public String assetExposure = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[4]/div/app-menu[1]";
    public String indexConstituents = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[4]/div/app-menu[2]";
    public String msciBarraFI = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[4]/div/app-menu[3]";
    public String sponser = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[5]/a/div";
    public String strategy = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[6]/a/div";
    public String client = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[7]/a/div";
    public String accountMenu = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[8]/a/div";
    public String broker = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[9]/a/div";
    public String offBMKSecurities = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[10]/a/div";
    public String restrictions = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[11]/a/div";
    public String codeTables = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/a/div";
    public String codesAndDescription = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[1]/a/div";
    public String accountPropertyCode = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[2]/a/div";
    public String portSpecPropertyCode = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[3]/a/div";
    public String accountFlow = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[4]/a/div";
    public String accountStatus = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[5]/a/div";
    public String accountType = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[6]/a/div";
    public String optimizedAcct = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[7]/a/div";
    public String sleeveModel = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[8]/a/div";
    public String taxStatus = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[9]/a/div";
    public String sellLogic = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[10]/a/div";
    public String brokerCode = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[11]/a/div";
    public String refPortType = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[12]/a/div";
    public String refPortSource = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[13]/a/div";
    public String factor = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[14]/a/div";
    public String factorType = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[15]/a/div";
    public String securityRestriction = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[16]/a/div";
    public String sectorRestriction = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[17]/a/div";
    public String sectorTypeRestriction = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[18]/a/div";
    public String urgl = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[19]/a/div";
    public String smaConfig = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[20]/a/div";
    public String creditScopeRating = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[21]/a/div";
    public String tPlanScenarioDefault = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[22]/a/div";
    public String benchmarkType = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[23]/a/div";
    public String benchmarkSource = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[24]/a/div";
    public String heldStatusCode = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[25]/a/div";
    public String marketData = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[13]";
    public String admin = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/a/div";
    public String app = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[1]/a/div";
    public String applicationLogs = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[1]/div/app-menu[1]/a/div";
    public String applicationProperties = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[1]/div/app-menu[2]/a/div";
    public String portSpecReportDef = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[1]/div/app-menu[3]/a/div";
    public String dataHealthChecks = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/a/div";
    public String autosysJobStatus = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/div/app-menu[1]";
    public String smaChacheService = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/div/app-menu[2]";
    public String msciBarraValidationRules = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/div/app-menu[3]";
    public String msciBarraValidation = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/div/app-menu[4]";
    public String close = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[2]/a/div";
    public String homeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[1]/a/div/text(;";
    public String dashboardText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[2]/a/div/text(;";
    public String transitionAnalysisText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[3]/a/div/text(;";
    public String templateImportText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[3]/div/app-menu[1]/a/div/text(;";
    public String viewImportedTemplatesText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[3]/div/app-menu[2]/a/div/text(;";
    public String transitionPlanReportsText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[3]/div/app-menu[3]/a/div/text(;";
    public String optimizationText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[4]/a/div/text(;";
    public String runStatusText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[4]/div/app-menu[1]/a/div/text(;";
    public String ahrTransitionAcctText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[4]/div/app-menu[2]/a/div/text(;";
    public String ahrActiveAcctText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[4]/div/app-menu[3]/a/div/text(;";
    public String tradingText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[5]/a/div/text(;";
    public String approveTradesText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[5]/div/app-menu[1]/a/div/text(;";
    public String viewWorkingTradesText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[5]/div/app-menu[2]/a/div/text(;";
    public String smaDataMaintenanceText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/a/div/text(;";
    public String portfolioSpecsText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[1]/a/div/text(;";
    public String referencePortfolioText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[2]/a/div/text(;";
    public String smaBenchmarksText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[3]/a/div/text(;";
    public String riskModelText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[4]/a/div/text(;";
    public String assetExposureText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[4]/div/app-menu[1]/a/div/text(;";
    public String indexConstituentsText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[4]/div/app-menu[2]/a/div/text(;";
    public String msciBarraFIText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[4]/div/app-menu[3]/a/div/text(;";
    public String sponserText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[5]/a/div/text(;";
    public String strategyText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[6]/a/div/text(;";
    public String clientText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[7]/a/div/text(;";
    public String accountMenuText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[8]/a/div/text(;";
    public String brokerText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[9]/a/div/text(;";
    public String offBMKSecuritiesText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[10]/a/div/text(;";
    public String restrictionsText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[11]/a/div/text(;";
    public String codeTablesText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/a/div/text(;";
    public String codesAndDescriptionText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[1]/a/div/text(;";
    public String accountPropertyCodeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[2]/a/div/text(;";
    public String portSpecPropertyCodeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[3]/a/div/text(;";
    public String accountFlowText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[4]/a/div/text(;";
    public String accountStatusText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[5]/a/div/text(;";
    public String accountTypeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[6]/a/div/text(;";
    public String optimizedAcctText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[7]/a/div/text(;";
    public String sleeveModelText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[8]/a/div/text(;";
    public String taxStatusText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[9]/a/div/text(;";
    public String sellLogicText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[10]/a/div/text(;";
    public String brokerCodeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[11]/a/div/text(;";
    public String refPortTypeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[12]/a/div/text(;";
    public String refPortSourceText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[13]/a/div/text(;";
    public String factorText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[14]/a/div/text(;";
    public String factorTypeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[15]/a/div/text(;";
    public String securityRestrictionText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[16]/a/div/text(;";
    public String sectorRestrictionText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[17]/a/div/text(;";
    public String sectorTypeRestrictionText = "/html/bdy/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[18]/a/div/text(;";
    public String urglText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[19]/a/div/text(;";
    public String smaConfigText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[20]/a/div/text(;";
    public String creditScopeRatingText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[21]/a/div/text(;";
    public String tPlanScenarioDefaultText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[22]/a/div/text(;";
    public String benchmarkTypeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[23]/a/div/text(;";
    public String benchmarkSourceText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[24]/a/div/text(;";
    public String heldStatusCodeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[12]/div/app-menu[25]/a/div/text(;";
    public String marketDataText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[6]/div/app-menu[13]/a/div/text(;";
    public String adminText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/a/div/text(;";
    public String appText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[1]/a/div/text(;";
    public String applicationLogsText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[1]/div/app-menu[1]/a/div/text(;";
    public String applicationPropertiesText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[1]/div/app-menu[2]/a/div/text(;";
    public String portSpecReportDefText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[1]/div/app-menu[3]/a/div/text(;";
    public String dataHealthChecksText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/a/div/text(;";
    public String autosysJobStatusText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/div/app-menu[1]/a/div/text(;";
    public String smaChacheServiceText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/div/app-menu[2]/a/div/text(;";
    public String msciBarraValidationRulesText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/div/app-menu[3]/a/div/text(;";
    public String msciBarraValidationText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[1]/app-menu[7]/div/app-menu[2]/div/app-menu[4]/a/div/text(;";
    public String closeText = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/mat-nav-list[2]/a/div/text(;";


    public homePage() throws AWTException {
    }


    public void verifyHomePage() {
        waitForElement(upperLogo);
        softAssertion.assertTrue(elementExists(upperLogo));
        softAssertion.assertTrue(elementExists(upperRemi));
        textCheck(upperRemi, "Remi - UAT");
        softAssertion.assertTrue(elementExists(welcomeUser));
        softAssertion.assertTrue(getWebElementText(welcomeUser).contains("Welcome"));
        softAssertion.assertTrue(elementExists(sandwichMenu));
        softAssertion.assertTrue(elementExists(gear));
        softAssertion.assertTrue(elementExists(help));
        softAssertion.assertTrue(elementExists(bell));
        softAssertion.assertTrue(elementExists(account));
        textCheck(welcomeRemi, "Welcome to Remi Portal!");
        softAssertion.assertTrue(elementExists(pageLogo));
        textCheck(supportedFeatures, "Supported features:");//Supported features:
        textCheck(table, "Optimization Transition Analysis Data Maintenance\n" +
                "Run Status\n" +
                "Ad Hoc Run: Transition Acct\n" +
                "Ad Hoc Run: Active Acct\n" +
                "Trade Mgmt & Delivery\n" +
                "Working Trades\n" +
                "Template Import\n" +
                "View Imported Template\n" +
                "Transition Plan Reports\n" +
                "Data Maint: Account(Incl. Restrictions)\n" +
                "Data Maint: Broker\n" +
                "Data Maint: Client(Incl. Restrictions)\n" +
                "Data Maint: Code Tables\n" +
                "Data Maint: Portfolio Specs\n" +
                "Data Maint: Reference Portfolio\n" +
                "Data Maint: Sponsor(Incl. Restrictions)\n" +
                "Data Maint: Strategy(Incl. Restrictions)\n" +
                "Risk Model: MSCI BarraFI");
    }

    public void verifySandwichMenu() {
        waitForElement(upperLogo);
        clickWebElement(sandwichMenu);
        waitForElement(home);
        clickWebElement(transitionAnalysis);
        clickWebElement(optimization);
        clickWebElement(trading);
        clickWebElement(smaDataMaintenance);
        clickWebElement(riskModel);
        clickWebElement(codeTables);
        clickWebElement(marketData);
        clickWebElement(admin);
        clickWebElement(app);
        clickWebElement(dataHealthChecks);
//        textCheck(homeText, "Home (ALT+H)");
//        textCheck(dashboardText, "Dashboard (CTRL+ALT+D)");
//        textCheck(transitionAnalysisText, "Transition Analysis");
//        textCheck(templateImportText, "Template Import");
//        textCheck(viewImportedTemplatesText, "View Imported Templates");
//        textCheck(transitionPlanReportsText, "Transition Plan Reports");
//        textCheck(optimizationText, "Optimization");
//        textCheck(runStatusText, "Run Status (ALT+R)");
//        textCheck(ahrTransitionAcctText, "Ad Hoc Run: Transition Acct");
//        textCheck(ahrActiveAcctText, "Trading");
//        textCheck(tradingText, "Trading");
//        textCheck(approveTradesText, "Approve Trades");
//        textCheck(viewWorkingTradesText, "View Working Trades");
//        textCheck(smaDataMaintenanceText, "SMA Data Maintenance");
//        textCheck(portfolioSpecsText, "Portfolio Specs");
//        textCheck(referencePortfolioText, "Reference Portfolio");
//        textCheck(smaBenchmarksText, "SMA Benchmarks");
//        textCheck(riskModelText, "Risk Model");
//        textCheck(assetExposureText, "Asset Exposure");
//        textCheck(indexConstituentsText, "Index Constituents");
//        textCheck(msciBarraFIText, "MSCI BarraFI");
//        textCheck(sponserText, "Sponser");
//        textCheck(strategyText, "Strategy");
//        textCheck(clientText, "Client");
//        textCheck(accountMenuText, "Account");
//        textCheck(brokerT+

        softAssertion.assertAll();
    }

    public void navigateToOne(String locator) {
        waitForElement(upperLogo);
        waitForElement(sandwichMenu);
        clickWebElement(sandwichMenu);
        waitForElement(home);
        clickWebElement(locator);

    }

    public void navigateToTwo(String locator1, String locator2) {
        waitForElement(upperLogo);
        waitForElement(sandwichMenu);
        clickWebElement(sandwichMenu);
        waitForElement(home);
        clickWebElement(locator1);
        clickWebElement(locator2);

    }
    public void navigateToThree(String locator1, String locator2, String locator3) {
        waitForElement(upperLogo);
        waitForElement(sandwichMenu);
        clickWebElement(sandwichMenu);
        waitForElement(home);
        clickWebElement(locator1);
        clickWebElement(locator2);
        clickWebElement(locator3);
    }

}
