{-# LANGUAGE OverloadedStrings #-}

module Main where

import System.Environment
import Lib

main :: IO ()
main = do
    args <- getArgs
    if length args == 0 then
        print $ sayHello Nothing
    else do
        putStrLn $ unlines $ map sayHello $ map Just args
