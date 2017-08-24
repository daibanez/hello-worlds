{-# LANGUAGE OverloadedStrings #-}

module Lib
    ( sayHello
    , strToMaybeStr
    ) where

import qualified Text.Format as TF

messageTemplate :: String
messageTemplate = "Hello {0}!"

defaultUser :: String
defaultUser = "world"

sayHello :: Maybe String -> String
sayHello Nothing = TF.format messageTemplate [defaultUser]
sayHello (Just name) = TF.format messageTemplate [name]

strToMaybeStr :: [String] -> [Maybe String]
strToMaybeStr [] = [Nothing]
strToMaybeStr x = map Just x
