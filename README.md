# Lint custom rules for android specific quality smells search  
  
To use the library you have to follow next simple steps:  
1) Add `maven { url 'https://jitpack.io' }` repository to your settings.gradle file:  
```  
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```  
2) Add a dependency to your module's build.gradle file:  
```  
dependencies {
    implementation 'com.github.ArionTheWanderer:android-quality-smells:0.1.0'
}
```  
3) It is recommended to add "checkOnly [checks ids]" attribute to a lintOptions block for a proper working lintFix task:  
```  
lintOptions {
        checkOnly 'Internal Getter', 'Internal Setter', 'Durable Wakelock', 'Inefficient data structure', 'Member-ignoring method', 'No Low Memory Resolver', 'Leaking Thread'
        ...
}
```  
4) Run `gradle :{module_name}:lint` task.  
5) To use autofix run `gradle :{module_name}:lintFix` task.  
