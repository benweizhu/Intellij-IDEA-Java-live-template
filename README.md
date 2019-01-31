# Intellij IDEA Java live template

## stream
#### filter

```sh
filter
```

```xml
<template name="filter" value="$ITERABLE_TYPE$.stream()&#10;    .filter($VAR$ -&gt; $VAR_CONDITION$)&#10;    .collect(Collectors.toList());" description="Iterate Iterable | Array in J2SDK 5.0 syntax" toReformat="true" toShortenFQNames="true">
  <variable name="ITERABLE_TYPE" expression="iterableVariable()" defaultValue="" alwaysStopAt="true" />
  <variable name="VAR" expression="suggestVariableName()" defaultValue="" alwaysStopAt="true" />
  <variable name="VAR_CONDITION" expression="suggestVariableName()" defaultValue="" alwaysStopAt="true" />
  <context>
    <option name="JAVA_CODE" value="true" />
  </context>
</template>
```

#### foreach

```sh
fore
```
```xml
<template name="fore" value="$ITERABLE_TYPE$.forEach($VAR$ -&gt; {&#10;  $EACH_VAR$&#10;});" description="Iterate Iterable | Array in J2SDK 5.0 syntax" toReformat="true" toShortenFQNames="true">
  <variable name="ITERABLE_TYPE" expression="iterableVariable()" defaultValue="" alwaysStopAt="true" />
  <variable name="VAR" expression="suggestVariableName()" defaultValue="" alwaysStopAt="true" />
  <variable name="EACH_VAR" expression="suggestVariableName()" defaultValue="" alwaysStopAt="true" />
  <context>
    <option name="JAVA_CODE" value="true" />
  </context>
</template>
```

#### map

```sh
map
```

![map](https://user-images.githubusercontent.com/5471228/52038121-2e00a280-256c-11e9-9503-3b11b5e7a922.gif)

```xml
<template name="map" value="$ITERABLE_TYPE$.stream().map($VAR$ -&gt; $MAP_VAR$).collect(Collectors.toList());" description="Iterate Iterable | Array in J2SDK 5.0 syntax" toReformat="true" toShortenFQNames="true">
  <variable name="VAR" expression="suggestVariableName()" defaultValue="" alwaysStopAt="true" />
  <variable name="ITERABLE_TYPE" expression="iterableVariable()" defaultValue="" alwaysStopAt="true" />
  <variable name="MAP_VAR" expression="suggestFirstVariableName()" defaultValue="" alwaysStopAt="true" />
  <context>
    <option name="JAVA_CODE" value="true" />
  </context>
</template>
```
