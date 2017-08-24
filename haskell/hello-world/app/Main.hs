{-# LANGUAGE OverloadedStrings #-}

module Main where

import System.Environment
import Lib

main :: IO ()
main = do
    args <- getArgs
    putStrLn $ unlines $ map sayHello $ strToMaybeStr $ args
