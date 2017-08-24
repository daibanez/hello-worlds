{-# LANGUAGE OverloadedStrings #-}

module Main where

import Test.Hspec
import Lib

-- `main` is here so that this module can be run from GHCi on its own.  It is
-- not needed for automatic spec discovery.
main :: IO ()
main = hspec spec

spec :: Spec
spec = do
  describe "sayHello" $ do
    it "say hello world" $ do
      sayHello Nothing `shouldBe` "Hello world!"
    it "say hello to name" $ do
      sayHello (Just "TestName") `shouldBe` "Hello TestName!"
