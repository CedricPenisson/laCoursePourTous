<?php

  try{
    $db = new PDO('mysql:host=localhost;dbname=lacoursepourtous;charset=utf8;port=3308','root','');
  } catch (Exception $e){
    die('Erreur : '.$e->getmessage());
  }
?>
