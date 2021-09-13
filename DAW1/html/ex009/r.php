<?php
print "<pre>"; print_r($_REQUEST); print "</pre>\n";
$fitxer = 'registre.txt';
$actual = file_get_contents($fitxer);
$actual .= "$_REQUEST[nom],$_REQUEST[pass],\n";
file_put_contents($fitxer, $actual);
?>