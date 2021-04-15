<?php
print "<pre>"; print_r($_REQUEST); print "</pre>\n";
$fitxer = 'registre.txt';
$actual = file_get_contents($fitxer);
$actual .= "$_REQUEST[nom],$_REQUEST[cognom],$_REQUEST[email],$_REQUEST[data],$_REQUEST[estudis],$_REQUEST[sexe],$_REQUEST[check],\n";
file_put_contents($fitxer, $actual);
?>