{-# LANGUAGE OverloadedStrings #-}

module Lib
    ( sayHello
    ) where

import qualified Text.Format as TF

messageTemplate :: String
messageTemplate = "Hello {0}!"

defaultUser :: String
defaultUser = "world"

sayHello :: Maybe String -> String
sayHello name = case name of
    Nothing -> TF.format messageTemplate [defaultUser]
    Just name -> TF.format messageTemplate [name]

