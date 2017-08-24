{-# LANGUAGE OverloadedStrings #-}

module Lib
    ( sayHello
    , listStrToListMaybeStr
    ) where

import qualified Text.Format as TF

messageTemplate :: String
messageTemplate = "Hello {0}!"

defaultUser :: String
defaultUser = "world"

sayHello :: Maybe String -> String
sayHello Nothing = TF.format messageTemplate [defaultUser]
sayHello (Just name) = TF.format messageTemplate [name]

listStrToListMaybeStr :: [String] -> [Maybe String]
listStrToListMaybeStr [] = [Nothing]
listStrToListMaybeStr x = map Just x
